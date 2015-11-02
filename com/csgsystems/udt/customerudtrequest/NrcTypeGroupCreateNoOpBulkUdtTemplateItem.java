/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTypeGroupCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcTypeGroupCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTypeGroupCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTypeGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcTypeGroupCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTypeGroupCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectData noOpInIn) {
    super(id, context, "NrcTypeGroupCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(noOpIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
/**
 *
 * Sets the  NrcTypeGroup
 * @param noOpInIn NrcTypeGroupObjectData to set
 *
 */
  public void setNrcTypeGroup(NrcTypeGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTypeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTypeGroupObjectData getNrcTypeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTypeGroupObjectHelper.fromMap(inputMap, "NrcTypeGroup");
  }
}
