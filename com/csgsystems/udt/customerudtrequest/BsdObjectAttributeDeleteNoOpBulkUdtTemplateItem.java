/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectAttributeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdObjectAttributeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectAttributeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectAttributeObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   BsdObjectAttributeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectAttributeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectBaseData noOpInIn) {
    super(id, context, "BsdObjectAttributeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
/**
 *
 * Sets the  BsdObjectAttribute
 * @param noOpInIn BsdObjectAttributeObjectBaseData to set
 *
 */
  public void setBsdObjectAttribute(BsdObjectAttributeObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObjectAttribute passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectAttributeObjectBaseData getBsdObjectAttribute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectAttributeObjectBaseHelper.fromMap(inputMap, "BsdObjectAttribute");
  }
}
