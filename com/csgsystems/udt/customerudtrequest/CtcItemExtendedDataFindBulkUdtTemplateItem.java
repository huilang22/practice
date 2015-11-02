/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemExtendedDataFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcItemExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcItemExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcItemExtendedDataObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcItemExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcItemExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectFilter FindInIn) {
    super(id, context, "CtcItemExtendedDataFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(FindIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }


/**
 *
 * Sets the CtcItemExtendedData
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcItemExtendedData(CtcItemExtendedDataObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcItemExtendedDataObjectHelper.fromMapFilter(inputMap, "CtcItemExtendedData");
  }

/**
 *
 * Gets the CtcItemExtendedData
 * @return Value of the CtcItemExtendedData
 *
 */

  public CtcItemExtendedDataObjectFilter getCtcItemExtendedData( ) {
    return FindIn;
  }

}
