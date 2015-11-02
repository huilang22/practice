/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimeGroupDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrTimeGroupDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrTimeGroupDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrTmGrpObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrTimeGroupDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrTimeGroupDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectData noOpInIn) {
    super(id, context, "RbrTimeGroupDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(noOpIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
/**
 *
 * Sets the  RbrTimeGroup
 * @param noOpInIn RbrTmGrpObjectData to set
 *
 */
  public void setRbrTimeGroup(RbrTmGrpObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrTimeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTmGrpObjectData getRbrTimeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrTmGrpObjectHelper.fromMap(inputMap, "RbrTimeGroup");
  }
}
