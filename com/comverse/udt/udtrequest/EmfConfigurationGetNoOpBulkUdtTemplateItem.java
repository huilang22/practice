/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EmfConfigurationGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EmfConfigurationGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EmfConfigurationObjectData noOpIn;

/**
 *
 * Constructor to create a   EmfConfigurationGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EmfConfigurationGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigurationObjectData noOpInIn) {
    super(id, context, "EmfConfigurationGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EmfConfiguration", EmfConfigurationObjectHelper.toMap(noOpIn, new HashMap(), "EmfConfiguration").get("EmfConfiguration"));
    }
  }
/**
 *
 * Sets the  EmfConfiguration
 * @param noOpInIn EmfConfigurationObjectData to set
 *
 */
  public void setEmfConfiguration(EmfConfigurationObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EmfConfiguration passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigurationObjectData getEmfConfiguration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EmfConfigurationObjectHelper.fromMap(inputMap, "EmfConfiguration");
  }
}
