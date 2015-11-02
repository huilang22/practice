/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PrivacyLevelDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PrivacyLevelDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrivacyLevelObjectKeyData PLDeleteIn;
/**
 *
 * Constructor to create a  PrivacyLevelDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrivacyLevelDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectKeyData PLDeleteInIn) {
    super(id, context, "PrivacyLevelDelete");
    PLDeleteIn = PLDeleteInIn;
  }

  public void translateToMap() {
    if (PLDeleteIn != null) {
      PLDeleteIn.resetFlags(true, true);
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(PLDeleteIn, new HashMap(), "PrivacyLevelObjectKeyData").get("PrivacyLevelObjectKeyData"));
    }
  }


/**
 *
 * Sets the PrivacyLevel
 * @param PLDeleteInIn Value of the PLDeleteIn
 *
 */

  public void setPrivacyLevel(PrivacyLevelObjectKeyData PLDeleteInIn) {
    PLDeleteIn = PLDeleteInIn;
  }

  public void translateFromMap() {
    PLDeleteIn = PrivacyLevelObjectKeyHelper.fromMap(inputMap, "PrivacyLevel");
  }

/**
 *
 * Gets the PrivacyLevel
 * @return Value of the PrivacyLevel
 *
 */

  public PrivacyLevelObjectKeyData getPrivacyLevel( ) {
    return PLDeleteIn;
  }

}
