/*
 * Generated code DO NOT EDIT
 * Generated file: AbiNrcDucGetBulkUdtTemplateItem.java
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
 * Class used to create a AbiNrcDucGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiNrcDucGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiNrcDucObjectKeyData AbiNrcDucGetIn;
/**
 *
 * Constructor to create a  AbiNrcDucGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiNrcDucGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiNrcDucObjectKeyData AbiNrcDucGetInIn) {
    super(id, context, "AbiNrcDucGet");
    AbiNrcDucGetIn = AbiNrcDucGetInIn;
  }

  public void translateToMap() {
    if (AbiNrcDucGetIn != null) {
      AbiNrcDucGetIn.resetFlags(true, true);
      addInput("AbiNrcDuc", AbiNrcDucObjectKeyHelper.toMap(AbiNrcDucGetIn, new HashMap(), "AbiNrcDucObjectKeyData").get("AbiNrcDucObjectKeyData"));
    }
  }


/**
 *
 * Sets the AbiNrcDuc
 * @param AbiNrcDucGetInIn Value of the AbiNrcDucGetIn
 *
 */

  public void setAbiNrcDuc(AbiNrcDucObjectKeyData AbiNrcDucGetInIn) {
    AbiNrcDucGetIn = AbiNrcDucGetInIn;
  }

  public void translateFromMap() {
    AbiNrcDucGetIn = AbiNrcDucObjectKeyHelper.fromMap(inputMap, "AbiNrcDuc");
  }

/**
 *
 * Gets the AbiNrcDuc
 * @return Value of the AbiNrcDuc
 *
 */

  public AbiNrcDucObjectKeyData getAbiNrcDuc( ) {
    return AbiNrcDucGetIn;
  }

}
