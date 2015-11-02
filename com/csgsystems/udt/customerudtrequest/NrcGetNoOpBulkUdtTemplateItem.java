/*
 * Generated code DO NOT EDIT
 * Generated file: NrcGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   NrcGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseData noOpInIn) {
    super(id, context, "NrcGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectBaseHelper.toMap(noOpIn, new HashMap(), "Nrc").get("Nrc"));
    }
  }
/**
 *
 * Sets the  Nrc
 * @param noOpInIn NrcObjectBaseData to set
 *
 */
  public void setNrc(NrcObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Nrc passed into the constructor
 * @return Simulated response
 *
 */
  public NrcObjectBaseData getNrc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcObjectBaseHelper.fromMap(inputMap, "Nrc");
  }
}
