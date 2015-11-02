/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationFindBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigurationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigurationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigurationObjectFilter EmfConfigurationFindIn;
/**
 *
 * Constructor to create a  EmfConfigurationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigurationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigurationObjectFilter EmfConfigurationFindInIn) {
    super(id, context, "EmfConfigurationFind");
    EmfConfigurationFindIn = EmfConfigurationFindInIn;
  }

  public void translateToMap() {
    if (EmfConfigurationFindIn != null) {
      Integer index =  EmfConfigurationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EmfConfiguration", EmfConfigurationObjectHelper.toMap(EmfConfigurationFindIn, new HashMap(), "EmfConfiguration").get("EmfConfiguration"));
    }
  }


/**
 *
 * Sets the EmfConfiguration
 * @param EmfConfigurationFindInIn Value of the EmfConfigurationFindIn
 *
 */

  public void setEmfConfiguration(EmfConfigurationObjectFilter EmfConfigurationFindInIn) {
    EmfConfigurationFindIn = EmfConfigurationFindInIn;
  }

  public void translateFromMap() {
    EmfConfigurationFindIn = EmfConfigurationObjectHelper.fromMapFilter(inputMap, "EmfConfiguration");
  }

/**
 *
 * Gets the EmfConfiguration
 * @return Value of the EmfConfiguration
 *
 */

  public EmfConfigurationObjectFilter getEmfConfiguration( ) {
    return EmfConfigurationFindIn;
  }

}
