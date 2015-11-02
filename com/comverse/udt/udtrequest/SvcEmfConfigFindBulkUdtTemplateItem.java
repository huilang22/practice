/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcEmfConfigFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a SvcEmfConfigFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SvcEmfConfigFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcEmfConfigObjectFilter SvcEmfConfigObjectIn;
/**
 *
 * Constructor to create a  SvcEmfConfigFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SvcEmfConfigFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcEmfConfigObjectFilter SvcEmfConfigObjectInIn) {
    super(id, context, "SvcEmfConfigFind");
    SvcEmfConfigObjectIn = SvcEmfConfigObjectInIn;
  }

  public void translateToMap() {
    if (SvcEmfConfigObjectIn != null) {
      Integer index =  SvcEmfConfigObjectIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcEmfConfig", SvcEmfConfigObjectHelper.toMap(SvcEmfConfigObjectIn, new HashMap(), "SvcEmfConfig").get("SvcEmfConfig"));
    }
  }


/**
 *
 * Sets the SvcEmfConfig
 * @param SvcEmfConfigObjectInIn Value of the SvcEmfConfigObjectIn
 *
 */

  public void setSvcEmfConfig(SvcEmfConfigObjectFilter SvcEmfConfigObjectInIn) {
    SvcEmfConfigObjectIn = SvcEmfConfigObjectInIn;
  }

  public void translateFromMap() {
    SvcEmfConfigObjectIn = SvcEmfConfigObjectHelper.fromMapFilter(inputMap, "SvcEmfConfig");
  }

/**
 *
 * Gets the SvcEmfConfig
 * @return Value of the SvcEmfConfig
 *
 */

  public SvcEmfConfigObjectFilter getSvcEmfConfig( ) {
    return SvcEmfConfigObjectIn;
  }

}
