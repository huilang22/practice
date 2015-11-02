/*
 * Generated code DO NOT EDIT
 * Generated file: ProviderClassCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ProviderClassCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProviderClassCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProvClsObjectData noOpIn;

/**
 *
 * Constructor to create a   ProviderClassCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProviderClassCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectData noOpInIn) {
    super(id, context, "ProviderClassCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ProviderClass", ProvClsObjectHelper.toMap(noOpIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
/**
 *
 * Sets the  ProviderClass
 * @param noOpInIn ProvClsObjectData to set
 *
 */
  public void setProviderClass(ProvClsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProviderClass passed into the constructor
 * @return Simulated response
 *
 */
  public ProvClsObjectData getProviderClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProvClsObjectHelper.fromMap(inputMap, "ProviderClass");
  }
}
