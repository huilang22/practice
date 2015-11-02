/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExtendedDataEnumerationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataEnumerationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EDObjectFilter EDFindIn;
/**
 *
 * Constructor to create a  ExtendedDataEnumerationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataEnumerationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectFilter EDFindInIn) {
    super(id, context, "ExtendedDataEnumerationFind");
    EDFindIn = EDFindInIn;
  }

  public void translateToMap() {
    if (EDFindIn != null) {
      Integer index =  EDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(EDFindIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }


/**
 *
 * Sets the ExtendedDataEnumeration
 * @param EDFindInIn Value of the EDFindIn
 *
 */

  public void setExtendedDataEnumeration(EDObjectFilter EDFindInIn) {
    EDFindIn = EDFindInIn;
  }

  public void translateFromMap() {
    EDFindIn = EDObjectHelper.fromMapFilter(inputMap, "ExtendedDataEnumeration");
  }

/**
 *
 * Gets the ExtendedDataEnumeration
 * @return Value of the ExtendedDataEnumeration
 *
 */

  public EDObjectFilter getExtendedDataEnumeration( ) {
    return EDFindIn;
  }

}
