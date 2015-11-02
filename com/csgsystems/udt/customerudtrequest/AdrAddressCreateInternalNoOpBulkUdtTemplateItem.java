/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAddressCreateInternalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdrAddressCreateInternalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdrAddressCreateInternalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LocalAddressObjectData noOpIn;

/**
 *
 * Constructor to create a   AdrAddressCreateInternalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdrAddressCreateInternalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LocalAddressObjectData noOpInIn) {
    super(id, context, "AdrAddressCreateInternal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(noOpIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }
/**
 *
 * Sets the  AdrAddress
 * @param noOpInIn LocalAddressObjectData to set
 *
 */
  public void setAdrAddress(LocalAddressObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdrAddress passed into the constructor
 * @return Simulated response
 *
 */
  public LocalAddressObjectData getAdrAddress() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LocalAddressObjectHelper.fromMap(inputMap, "AdrAddress");
  }
}
