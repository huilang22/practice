/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GenderTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenderTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GenderTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   GenderTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenderTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectData noOpInIn) {
    super(id, context, "GenderTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GenderType", GenderTypeObjectHelper.toMap(noOpIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }
/**
 *
 * Sets the  GenderType
 * @param noOpInIn GenderTypeObjectData to set
 *
 */
  public void setGenderType(GenderTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GenderType passed into the constructor
 * @return Simulated response
 *
 */
  public GenderTypeObjectData getGenderType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GenderTypeObjectHelper.fromMap(inputMap, "GenderType");
  }
}
