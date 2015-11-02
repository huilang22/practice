/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdAcctMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExternalIdAcctMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdAcctMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EIAMObjectData noOpIn;

/**
 *
 * Constructor to create a   ExternalIdAcctMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdAcctMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EIAMObjectData noOpInIn) {
    super(id, context, "ExternalIdAcctMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExternalIdAcctMap", EIAMObjectHelper.toMap(noOpIn, new HashMap(), "ExternalIdAcctMap").get("ExternalIdAcctMap"));
    }
  }
/**
 *
 * Sets the  ExternalIdAcctMap
 * @param noOpInIn EIAMObjectData to set
 *
 */
  public void setExternalIdAcctMap(EIAMObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdAcctMap passed into the constructor
 * @return Simulated response
 *
 */
  public EIAMObjectData getExternalIdAcctMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EIAMObjectHelper.fromMap(inputMap, "ExternalIdAcctMap");
  }
}
