/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a EmfConfigurationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigurationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigurationObjectKeyData EmfConfigurationGetIn;
/**
 *
 * Constructor to create a  EmfConfigurationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigurationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigurationObjectKeyData EmfConfigurationGetInIn) {
    super(id, context, "EmfConfigurationGet");
    EmfConfigurationGetIn = EmfConfigurationGetInIn;
  }

  public void translateToMap() {
    if (EmfConfigurationGetIn != null) {
      EmfConfigurationGetIn.resetFlags(true, true);
      addInput("EmfConfiguration", EmfConfigurationObjectKeyHelper.toMap(EmfConfigurationGetIn, new HashMap(), "EmfConfigurationObjectKeyData").get("EmfConfigurationObjectKeyData"));
    }
  }


/**
 *
 * Sets the EmfConfiguration
 * @param EmfConfigurationGetInIn Value of the EmfConfigurationGetIn
 *
 */

  public void setEmfConfiguration(EmfConfigurationObjectKeyData EmfConfigurationGetInIn) {
    EmfConfigurationGetIn = EmfConfigurationGetInIn;
  }

  public void translateFromMap() {
    EmfConfigurationGetIn = EmfConfigurationObjectKeyHelper.fromMap(inputMap, "EmfConfiguration");
  }

/**
 *
 * Gets the EmfConfiguration
 * @return Value of the EmfConfiguration
 *
 */

  public EmfConfigurationObjectKeyData getEmfConfiguration( ) {
    return EmfConfigurationGetIn;
  }

}
