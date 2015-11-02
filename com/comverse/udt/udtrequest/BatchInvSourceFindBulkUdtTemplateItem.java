/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchInvSourceFindBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchInvSourceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchInvSourceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BISObjectFilter BISFindIn;
/**
 *
 * Constructor to create a  BatchInvSourceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchInvSourceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectFilter BISFindInIn) {
    super(id, context, "BatchInvSourceFind");
    BISFindIn = BISFindInIn;
  }

  public void translateToMap() {
    if (BISFindIn != null) {
      Integer index =  BISFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchInvSource", BISObjectHelper.toMap(BISFindIn, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }


/**
 *
 * Sets the BatchInvSource
 * @param BISFindInIn Value of the BISFindIn
 *
 */

  public void setBatchInvSource(BISObjectFilter BISFindInIn) {
    BISFindIn = BISFindInIn;
  }

  public void translateFromMap() {
    BISFindIn = BISObjectHelper.fromMapFilter(inputMap, "BatchInvSource");
  }

/**
 *
 * Gets the BatchInvSource
 * @return Value of the BatchInvSource
 *
 */

  public BISObjectFilter getBatchInvSource( ) {
    return BISFindIn;
  }

}
