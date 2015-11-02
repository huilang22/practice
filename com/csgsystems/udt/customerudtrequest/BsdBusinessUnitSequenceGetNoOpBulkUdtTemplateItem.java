/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitSequenceGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdBusinessUnitSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdBusinessUnitSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdBusinessUnitObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdBusinessUnitSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdBusinessUnitSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectKeyData noOpInIn) {
    super(id, context, "BsdBusinessUnitSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
/**
 *
 * Sets the  BsdBusinessUnit
 * @param noOpInIn BsdBusinessUnitObjectKeyData to set
 *
 */
  public void setBsdBusinessUnit(BsdBusinessUnitObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdBusinessUnit passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectKeyData getBsdBusinessUnit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdBusinessUnitObjectKeyHelper.fromMap(inputMap, "BsdBusinessUnit");
  }
}
