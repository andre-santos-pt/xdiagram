package org.eclipselabs.xdiagram.provider.internal;

//Revised from objectweb jac
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
public class WeakList extends AbstractList {
  /**
   * Reference queue for cleared weak references
   */
  private final ReferenceQueue queue = new ReferenceQueue();

  private final List list=new ArrayList();
  public boolean add(Object o) {
      expungeStaleEntries();
      return list.add(new ListEntry(o,queue));
  }
  public Object get(int i) {
      expungeStaleEntries();
      return ((Reference)list.get(i)).get();
  }
  public int size() {
      //new Exception().printStackTrace();
      expungeStaleEntries();
      return list.size();
  }
  public Object remove(int index) {
      return ((ListEntry)list.remove(index)).get();
  }
  /**
   * Expunge stale entries from the list.
   */
  private void expungeStaleEntries() {
      Object r;
      while ( (r = queue.poll()) != null) {
          ListEntry e = (ListEntry)r;
          int i=list.indexOf(r);
          if(i!=-1) {
              list.remove(i);
          }
      }
  }
  private static class ListEntry extends WeakReference {
      String objectString;
      public ListEntry(Object o,ReferenceQueue queue) {
          super(o,queue);
          objectString=o.toString();
      }
      public boolean equals(Object o) {
          if(o==null) {
              return false;
          } else {
              if((o instanceof ListEntry)) {
                  return o.hashCode()==this.hashCode();
              } else {
                  if(this.get()==null) return false;
                  return this.get().equals(o);
              }
          }
      }
      public String toString() {
          if(this.get()==null) {
              return "entry "+objectString+" <GARBAGED>";
          } else {
              return "entry "+this.get()+"";
          }
      }

  }
}