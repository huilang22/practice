/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxTypeCommGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a TaxTypeCommGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxTypeCommGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TTCObjectData noOpIn;

/**
 *
 * Constructor to create a   TaxTypeCommGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxTypeCommGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TTCObjectData noOpInIn) {
    super(id, context, "TaxTypeCommGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TaxTypeComm", TTCObjectHelper.toMap(noOpIn, new HashMap(), "TaxTypeComm").get("TaxTypeComm"));
    }
  }
/**
 *
 * Sets the  TaxTypeComm
 * @param noOpInIn TTCObjectData to set
 *
 */
  public void setTaxTypeComm(TTCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxTypeComm passed into the constructor
 * @return Simulated response
 *
 */
  public TTCObjectData getTaxTypeComm() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TTCObjectHelper.fromMap(inputMap, "TaxTypeComm");
  }
}
