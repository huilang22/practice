/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a AdrAddressGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdrAddressGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdrAddressObjectData noOpIn;

/**
 *
 * Constructor to create a   AdrAddressGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdrAddressGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdrAddressObjectData noOpInIn) {
    super(id, context, "AdrAddressGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(noOpIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
/**
 *
 * Sets the  AdrAddress
 * @param noOpInIn AdrAddressObjectData to set
 *
 */
  public void setAdrAddress(AdrAddressObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdrAddress passed into the constructor
 * @return Simulated response
 *
 */
  public AdrAddressObjectData getAdrAddress() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdrAddressObjectHelper.fromMap(inputMap, "AdrAddress");
  }
}
