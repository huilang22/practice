/*
 * Generated code DO NOT EDIT
 * Generated file: SpecialDestinationTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SpecialDestinationTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SpecialDestinationTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SpecialDestinationTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   SpecialDestinationTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SpecialDestinationTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectData noOpInIn) {
    super(id, context, "SpecialDestinationTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(noOpIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }
/**
 *
 * Sets the  SpecialDestinationType
 * @param noOpInIn SpecialDestinationTypeObjectData to set
 *
 */
  public void setSpecialDestinationType(SpecialDestinationTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SpecialDestinationType passed into the constructor
 * @return Simulated response
 *
 */
  public SpecialDestinationTypeObjectData getSpecialDestinationType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SpecialDestinationTypeObjectHelper.fromMap(inputMap, "SpecialDestinationType");
  }
}
