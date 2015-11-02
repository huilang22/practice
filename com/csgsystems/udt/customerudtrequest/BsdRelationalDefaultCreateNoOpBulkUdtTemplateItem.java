/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalDefaultCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalDefaultCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalDefaultObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalDefaultCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalDefaultCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectBaseData noOpInIn) {
    super(id, context, "BsdRelationalDefaultCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
/**
 *
 * Sets the  BsdRelationalDefault
 * @param noOpInIn BsdRelationalDefaultObjectBaseData to set
 *
 */
  public void setBsdRelationalDefault(BsdRelationalDefaultObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectBaseData getBsdRelationalDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalDefaultObjectBaseHelper.fromMap(inputMap, "BsdRelationalDefault");
  }
}
