/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideFindBulkUdtTemplateItem.java
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
 * Class used to create a BillModeOverrideFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillModeOverrideFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BMOObjectFilter BMOFindIn;
/**
 *
 * Constructor to create a  BillModeOverrideFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillModeOverrideFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BMOObjectFilter BMOFindInIn) {
    super(id, context, "BillModeOverrideFind");
    BMOFindIn = BMOFindInIn;
  }

  public void translateToMap() {
    if (BMOFindIn != null) {
      Integer index =  BMOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillModeOverride", BMOObjectHelper.toMap(BMOFindIn, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }


/**
 *
 * Sets the BillModeOverride
 * @param BMOFindInIn Value of the BMOFindIn
 *
 */

  public void setBillModeOverride(BMOObjectFilter BMOFindInIn) {
    BMOFindIn = BMOFindInIn;
  }

  public void translateFromMap() {
    BMOFindIn = BMOObjectHelper.fromMapFilter(inputMap, "BillModeOverride");
  }

/**
 *
 * Gets the BillModeOverride
 * @return Value of the BillModeOverride
 *
 */

  public BMOObjectFilter getBillModeOverride( ) {
    return BMOFindIn;
  }

}
