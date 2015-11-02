/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeDefaultCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeDefaultCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeDefaultObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeDefaultCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeDefaultCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeDefaultObjectBaseData noOpInIn) {
    super(id, context, "BsdAttributeDefaultCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
/**
 *
 * Sets the  BsdAttributeDefault
 * @param noOpInIn BsdAttributeDefaultObjectBaseData to set
 *
 */
  public void setBsdAttributeDefault(BsdAttributeDefaultObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectBaseData getBsdAttributeDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeDefaultObjectBaseHelper.fromMap(inputMap, "BsdAttributeDefault");
  }
}
