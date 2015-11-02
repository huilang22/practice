/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PrivacyLevelUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PrivacyLevelUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrivacyLevelObjectData PLUpdateIn;
/**
 *
 * Constructor to create a  PrivacyLevelUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrivacyLevelUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectData PLUpdateInIn) {
    super(id, context, "PrivacyLevelUpdate");
    PLUpdateIn = PLUpdateInIn;
  }

  public void translateToMap() {
    if (PLUpdateIn != null) {
      PLUpdateIn.resetFlags(true, true);
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(PLUpdateIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }


/**
 *
 * Sets the PrivacyLevel
 * @param PLUpdateInIn Value of the PLUpdateIn
 *
 */

  public void setPrivacyLevel(PrivacyLevelObjectData PLUpdateInIn) {
    PLUpdateIn = PLUpdateInIn;
  }

  public void translateFromMap() {
    PLUpdateIn = PrivacyLevelObjectHelper.fromMap(inputMap, "PrivacyLevel");
  }

/**
 *
 * Gets the PrivacyLevel
 * @return Value of the PrivacyLevel
 *
 */

  public PrivacyLevelObjectData getPrivacyLevel( ) {
    return PLUpdateIn;
  }

}
