/*
 * Generated code DO NOT EDIT
 * Generated file: NrcGroupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   NrcGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcGroupObjectData noOpInIn) {
    super(id, context, "NrcGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NrcGroup", NrcGroupObjectHelper.toMap(noOpIn, new HashMap(), "NrcGroup").get("NrcGroup"));
    }
  }
/**
 *
 * Sets the  NrcGroup
 * @param noOpInIn NrcGroupObjectData to set
 *
 */
  public void setNrcGroup(NrcGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcGroup passed into the constructor
 * @return Simulated response
 *
 */
  public NrcGroupObjectData getNrcGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcGroupObjectHelper.fromMap(inputMap, "NrcGroup");
  }
}
