/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsExtDataMapDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsExtDataMapDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsExtDataMapObjectKeyData deleteIn;
/**
 *
 * Constructor to create a  InvsExtDataMapDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsExtDataMapDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectKeyData deleteInIn) {
    super(id, context, "InvsExtDataMapDelete");
    deleteIn = deleteInIn;
  }

  public void translateToMap() {
    if (deleteIn != null) {
      deleteIn.resetFlags(true, true);
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(deleteIn, new HashMap(), "InvsExtDataMapObjectKeyData").get("InvsExtDataMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsExtDataMap
 * @param deleteInIn Value of the deleteIn
 *
 */

  public void setInvsExtDataMap(InvsExtDataMapObjectKeyData deleteInIn) {
    deleteIn = deleteInIn;
  }

  public void translateFromMap() {
    deleteIn = InvsExtDataMapObjectKeyHelper.fromMap(inputMap, "InvsExtDataMap");
  }

/**
 *
 * Gets the InvsExtDataMap
 * @return Value of the InvsExtDataMap
 *
 */

  public InvsExtDataMapObjectKeyData getInvsExtDataMap( ) {
    return deleteIn;
  }

}
