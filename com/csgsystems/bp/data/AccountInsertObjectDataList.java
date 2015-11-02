/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountInsertObjectDataList.java
 * Definition File: Customer/AccountInsert.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *---------------------------------------------------------------------------*/
/**---------------------------------------------------------------------------
 * Object Summary Information
 *----------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.data;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.ArubaObjectList;



/** List object */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PUBLIC_MEMBER)
public class AccountInsertObjectDataList extends ArubaObjectList implements Serializable
{
  /** The array of objects */
  public AccountInsertObjectData[] array = null;
  
  public AccountInsertObjectDataList () {} 
  /** constructor
   * @param array      the array of objects
   * @param index      the Index offset for this result set
   * @param totalCount the total count of records the query resulted in
   */
  public AccountInsertObjectDataList (AccountInsertObjectData[] array, Integer index, Integer totalCount) {
    this.array = array;
    if (index != null) this.index = index.intValue ();
    if (totalCount != null) this.totalCount = totalCount.intValue ();
  }
  /** Retrieve the length of this list
   * @return int the length of the list
   */
  public int getLength () {
    return array.length;
  }
  /** Retrieve the array of objects.
   * @return AccountInsertObjectData[] the object array
   */
  public AccountInsertObjectData[] getArray () {
    return this.array;
  }

  /** Retrieve the Collection of objects.
   * @return AccountInsertObjectData[] the object collection
   */
  public Collection getData () {
    Collection list = null;
    if (this.array != null) {
      list = new ArrayList();
      for (int i = 0; i < array.length; i++) {
        list.add(array[i]);
      }
    }
    return list;
  }

  public String toString() {
    AccountInsertObjectData[] array = getArray();
    StringBuffer buff = new StringBuffer("Length = "+getLength());
    if (array != null) {
      AccountInsertObjectData data = null;
      for (int i = 0; i < array.length; i++) {
        buff.append("["+i+"]"+AccountInsertObjectHelper.toMap(data, null).toString());
      }
    }
    return buff.toString();
  }
}
