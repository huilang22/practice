/*
 * Generated code DO NOT EDIT
 * Generated file: JurisdictionGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a JurisdictionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class JurisdictionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected JurisdictionObjectData noOpIn;

/**
 *
 * Constructor to create a   JurisdictionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public JurisdictionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, JurisdictionObjectData noOpInIn) {
    super(id, context, "JurisdictionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Jurisdiction", JurisdictionObjectHelper.toMap(noOpIn, new HashMap(), "Jurisdiction").get("Jurisdiction"));
    }
  }
/**
 *
 * Sets the  Jurisdiction
 * @param noOpInIn JurisdictionObjectData to set
 *
 */
  public void setJurisdiction(JurisdictionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Jurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public JurisdictionObjectData getJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = JurisdictionObjectHelper.fromMap(inputMap, "Jurisdiction");
  }
}
