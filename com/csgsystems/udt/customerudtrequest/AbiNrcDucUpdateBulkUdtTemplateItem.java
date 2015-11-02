/*
 * Generated code DO NOT EDIT
 * Generated file: AbiNrcDucUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AbiNrcDucUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiNrcDucUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiNrcDucObjectData AbiNrcDucUpdateIn;
/**
 *
 * Constructor to create a  AbiNrcDucUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiNrcDucUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiNrcDucObjectData AbiNrcDucUpdateInIn) {
    super(id, context, "AbiNrcDucUpdate");
    AbiNrcDucUpdateIn = AbiNrcDucUpdateInIn;
  }

  public void translateToMap() {
    if (AbiNrcDucUpdateIn != null) {
      AbiNrcDucUpdateIn.resetFlags(true, true);
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(AbiNrcDucUpdateIn, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }


/**
 *
 * Sets the AbiNrcDuc
 * @param AbiNrcDucUpdateInIn Value of the AbiNrcDucUpdateIn
 *
 */

  public void setAbiNrcDuc(AbiNrcDucObjectData AbiNrcDucUpdateInIn) {
    AbiNrcDucUpdateIn = AbiNrcDucUpdateInIn;
  }

  public void translateFromMap() {
    AbiNrcDucUpdateIn = AbiNrcDucObjectHelper.fromMap(inputMap, "AbiNrcDuc");
  }

/**
 *
 * Gets the AbiNrcDuc
 * @return Value of the AbiNrcDuc
 *
 */

  public AbiNrcDucObjectData getAbiNrcDuc( ) {
    return AbiNrcDucUpdateIn;
  }

}
