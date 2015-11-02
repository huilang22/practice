/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PrivacyLevelDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PrivacyLevelDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PrivacyLevelObjectData noOpIn;

/**
 *
 * Constructor to create a   PrivacyLevelDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PrivacyLevelDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectData noOpInIn) {
    super(id, context, "PrivacyLevelDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(noOpIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
/**
 *
 * Sets the  PrivacyLevel
 * @param noOpInIn PrivacyLevelObjectData to set
 *
 */
  public void setPrivacyLevel(PrivacyLevelObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PrivacyLevel passed into the constructor
 * @return Simulated response
 *
 */
  public PrivacyLevelObjectData getPrivacyLevel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PrivacyLevelObjectHelper.fromMap(inputMap, "PrivacyLevel");
  }
}
