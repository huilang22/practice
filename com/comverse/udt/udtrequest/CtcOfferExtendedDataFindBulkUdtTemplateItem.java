/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcOfferExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOfferExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOfferExtendedDataObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcOfferExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOfferExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectFilter FindInIn) {
    super(id, context, "CtcOfferExtendedDataFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }


/**
 *
 * Sets the CtcOfferExtendedData
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcOfferExtendedDataObjectHelper.fromMapFilter(inputMap, "CtcOfferExtendedData");
  }

/**
 *
 * Gets the CtcOfferExtendedData
 * @return Value of the CtcOfferExtendedData
 *
 */

  public CtcOfferExtendedDataObjectFilter getCtcOfferExtendedData( ) {
    return FindIn;
  }

}
