/*
 * Generated code DO NOT EDIT
 * Generated file: MktCodeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MktCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MktCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MCObjectData noOpIn;

/**
 *
 * Constructor to create a   MktCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MktCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectData noOpInIn) {
    super(id, context, "MktCodeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MktCode", MCObjectHelper.toMap(noOpIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }
/**
 *
 * Sets the  MktCode
 * @param noOpInIn MCObjectData to set
 *
 */
  public void setMktCode(MCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MktCode passed into the constructor
 * @return Simulated response
 *
 */
  public MCObjectData getMktCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MCObjectHelper.fromMap(inputMap, "MktCode");
  }
}
