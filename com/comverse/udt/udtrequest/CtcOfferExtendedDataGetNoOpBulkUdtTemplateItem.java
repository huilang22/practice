/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferExtendedDataGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferExtendedDataGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferExtendedDataObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcOfferExtendedDataGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferExtendedDataGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectData noOpInIn) {
    super(id, context, "CtcOfferExtendedDataGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
/**
 *
 * Sets the  CtcOfferExtendedData
 * @param noOpInIn CtcOfferExtendedDataObjectData to set
 *
 */
  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferExtendedDataObjectHelper.fromMap(inputMap, "CtcOfferExtendedData");
  }
}
