/*
 * Generated code DO NOT EDIT
 * Generated file: JurisdictionGetBulkUdtTemplateItem.java
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
 * Class used to create a JurisdictionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class JurisdictionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JurisdictionObjectKeyData jurGetIn;
/**
 *
 * Constructor to create a  JurisdictionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JurisdictionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, JurisdictionObjectKeyData jurGetInIn) {
    super(id, context, "JurisdictionGet");
    jurGetIn = jurGetInIn;
  }

  public void translateToMap() {
    if (jurGetIn != null) {
      jurGetIn.resetFlags(true, true);
      addInput("Jurisdiction", JurisdictionObjectKeyHelper.toMap(jurGetIn, new HashMap(), "JurisdictionObjectKeyData").get("JurisdictionObjectKeyData"));
    }
  }


/**
 *
 * Sets the Jurisdiction
 * @param jurGetInIn Value of the jurGetIn
 *
 */

  public void setJurisdiction(JurisdictionObjectKeyData jurGetInIn) {
    jurGetIn = jurGetInIn;
  }

  public void translateFromMap() {
    jurGetIn = JurisdictionObjectKeyHelper.fromMap(inputMap, "Jurisdiction");
  }

/**
 *
 * Gets the Jurisdiction
 * @return Value of the Jurisdiction
 *
 */

  public JurisdictionObjectKeyData getJurisdiction( ) {
    return jurGetIn;
  }

}
