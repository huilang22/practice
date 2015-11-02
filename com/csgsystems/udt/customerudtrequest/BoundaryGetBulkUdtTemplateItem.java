/*
 * Generated code DO NOT EDIT
 * Generated file: BoundaryGetBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a BoundaryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BoundaryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BoundaryObjectKeyData BoundaryGetIn;
/**
 *
 * Constructor to create a  BoundaryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BoundaryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BoundaryObjectKeyData BoundaryGetInIn) {
    super(id, context, "BoundaryGet");
    BoundaryGetIn = BoundaryGetInIn;
  }

  public void translateToMap() {
    if (BoundaryGetIn != null) {
      BoundaryGetIn.resetFlags(true, true);
      addInput("Boundary", BoundaryObjectKeyHelper.toMap(BoundaryGetIn, new HashMap(), "BoundaryObjectKeyData").get("BoundaryObjectKeyData"));
    }
  }


/**
 *
 * Sets the Boundary
 * @param BoundaryGetInIn Value of the BoundaryGetIn
 *
 */

  public void setBoundary(BoundaryObjectKeyData BoundaryGetInIn) {
    BoundaryGetIn = BoundaryGetInIn;
  }

  public void translateFromMap() {
    BoundaryGetIn = BoundaryObjectKeyHelper.fromMap(inputMap, "Boundary");
  }

/**
 *
 * Gets the Boundary
 * @return Value of the Boundary
 *
 */

  public BoundaryObjectKeyData getBoundary( ) {
    return BoundaryGetIn;
  }

}
