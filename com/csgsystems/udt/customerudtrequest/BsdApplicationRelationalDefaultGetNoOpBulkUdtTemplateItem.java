/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalDefaultGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationRelationalDefaultGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationRelationalDefaultGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationRelationalDefaultObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationRelationalDefaultGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationRelationalDefaultGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationRelationalDefaultObjectData noOpInIn) {
    super(id, context, "BsdApplicationRelationalDefaultGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdApplicationRelationalDefault", BsdApplicationRelationalDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationRelationalDefault").get("BsdApplicationRelationalDefault"));
    }
  }
/**
 *
 * Sets the  BsdApplicationRelationalDefault
 * @param noOpInIn BsdApplicationRelationalDefaultObjectData to set
 *
 */
  public void setBsdApplicationRelationalDefault(BsdApplicationRelationalDefaultObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationRelationalDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationRelationalDefaultObjectData getBsdApplicationRelationalDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationRelationalDefaultObjectHelper.fromMap(inputMap, "BsdApplicationRelationalDefault");
  }
}
