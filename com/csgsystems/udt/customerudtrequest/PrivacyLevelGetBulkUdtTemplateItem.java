/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelGetBulkUdtTemplateItem.java
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
 * Class used to create a PrivacyLevelGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PrivacyLevelGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrivacyLevelObjectKeyData PLGetIn;
/**
 *
 * Constructor to create a  PrivacyLevelGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrivacyLevelGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectKeyData PLGetInIn) {
    super(id, context, "PrivacyLevelGet");
    PLGetIn = PLGetInIn;
  }

  public void translateToMap() {
    if (PLGetIn != null) {
      PLGetIn.resetFlags(true, true);
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(PLGetIn, new HashMap(), "PrivacyLevelObjectKeyData").get("PrivacyLevelObjectKeyData"));
    }
  }


/**
 *
 * Sets the PrivacyLevel
 * @param PLGetInIn Value of the PLGetIn
 *
 */

  public void setPrivacyLevel(PrivacyLevelObjectKeyData PLGetInIn) {
    PLGetIn = PLGetInIn;
  }

  public void translateFromMap() {
    PLGetIn = PrivacyLevelObjectKeyHelper.fromMap(inputMap, "PrivacyLevel");
  }

/**
 *
 * Gets the PrivacyLevel
 * @return Value of the PrivacyLevel
 *
 */

  public PrivacyLevelObjectKeyData getPrivacyLevel( ) {
    return PLGetIn;
  }

}
