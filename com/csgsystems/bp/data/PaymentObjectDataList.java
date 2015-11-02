/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentObjectDataList.java
 * Definition File: Customer/Payment.xml
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

import com.csgsystems.bp.data.*;


/** List object */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PUBLIC_MEMBER)
public class PaymentObjectDataList extends ArubaObjectList implements Serializable
{
  /** The array of objects */
  public PaymentObjectData[] array = null;
  
  public PaymentObjectDataList () {} 
  /** constructor
   * @param array      the array of objects
   * @param index      the Index offset for this result set
   * @param totalCount the total count of records the query resulted in
   */
  public PaymentObjectDataList (PaymentObjectData[] array, Integer index, Integer totalCount) {
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
   * @return PaymentObjectData[] the object array
   */
  public PaymentObjectData[] getArray () {
    return this.array;
  }

  /** Retrieve the Collection of objects.
   * @return PaymentObjectData[] the object collection
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
    PaymentObjectData[] array = getArray();
    StringBuffer buff = new StringBuffer("Length = "+getLength());
    if (array != null) {
      PaymentObjectData data = null;
      for (int i = 0; i < array.length; i++) {
        buff.append("["+i+"]"+PaymentObjectHelper.toMap(data, null).toString());
      }
    }
    return buff.toString();
  }
}
