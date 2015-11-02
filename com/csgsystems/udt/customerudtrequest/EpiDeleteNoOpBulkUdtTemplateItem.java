/*
 * Generated code DO NOT EDIT
 * Generated file: EpiDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EpiDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EpiDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EpiObjectData noOpIn;

/**
 *
 * Constructor to create a   EpiDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EpiDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectData noOpInIn) {
    super(id, context, "EpiDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Epi", EpiObjectHelper.toMap(noOpIn, new HashMap(), "Epi").get("Epi"));
    }
  }
/**
 *
 * Sets the  Epi
 * @param noOpInIn EpiObjectData to set
 *
 */
  public void setEpi(EpiObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Epi passed into the constructor
 * @return Simulated response
 *
 */
  public EpiObjectData getEpi() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EpiObjectHelper.fromMap(inputMap, "Epi");
  }
}
