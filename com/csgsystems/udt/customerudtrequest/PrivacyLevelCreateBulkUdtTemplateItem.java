/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelCreateBulkUdtTemplateItem.java
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
 * Class used to create a PrivacyLevelCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PrivacyLevelCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrivacyLevelObjectData PLCreateIn;
/**
 *
 * Constructor to create a  PrivacyLevelCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrivacyLevelCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectData PLCreateInIn) {
    super(id, context, "PrivacyLevelCreate");
    PLCreateIn = PLCreateInIn;
  }

  public void translateToMap() {
    if (PLCreateIn != null) {
      PLCreateIn.resetFlags(true, true);
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(PLCreateIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }


/**
 *
 * Sets the PrivacyLevel
 * @param PLCreateInIn Value of the PLCreateIn
 *
 */

  public void setPrivacyLevel(PrivacyLevelObjectData PLCreateInIn) {
    PLCreateIn = PLCreateInIn;
  }

  public void translateFromMap() {
    PLCreateIn = PrivacyLevelObjectHelper.fromMap(inputMap, "PrivacyLevel");
  }

/**
 *
 * Gets the PrivacyLevel
 * @return Value of the PrivacyLevel
 *
 */

  public PrivacyLevelObjectData getPrivacyLevel( ) {
    return PLCreateIn;
  }

}
