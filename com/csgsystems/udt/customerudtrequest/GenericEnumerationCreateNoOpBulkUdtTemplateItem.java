/*
 * Generated code DO NOT EDIT
 * Generated file: GenericEnumerationCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GenericEnumerationCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenericEnumerationCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GEObjectData noOpIn;

/**
 *
 * Constructor to create a   GenericEnumerationCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenericEnumerationCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectData noOpInIn) {
    super(id, context, "GenericEnumerationCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GenericEnumeration", GEObjectHelper.toMap(noOpIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }
/**
 *
 * Sets the  GenericEnumeration
 * @param noOpInIn GEObjectData to set
 *
 */
  public void setGenericEnumeration(GEObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GenericEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public GEObjectData getGenericEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GEObjectHelper.fromMap(inputMap, "GenericEnumeration");
  }
}
