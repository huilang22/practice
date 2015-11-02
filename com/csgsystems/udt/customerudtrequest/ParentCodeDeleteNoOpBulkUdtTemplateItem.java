/*
 * Generated code DO NOT EDIT
 * Generated file: ParentCodeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ParentCodeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ParentCodeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ParentCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   ParentCodeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ParentCodeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectData noOpInIn) {
    super(id, context, "ParentCodeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ParentCode", ParentCodeObjectHelper.toMap(noOpIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
/**
 *
 * Sets the  ParentCode
 * @param noOpInIn ParentCodeObjectData to set
 *
 */
  public void setParentCode(ParentCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ParentCode passed into the constructor
 * @return Simulated response
 *
 */
  public ParentCodeObjectData getParentCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ParentCodeObjectHelper.fromMap(inputMap, "ParentCode");
  }
}
