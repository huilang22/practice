/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a StatusReasonMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SRMObjectFilter SRMFindIn;
/**
 *
 * Constructor to create a  StatusReasonMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SRMObjectFilter SRMFindInIn) {
    super(id, context, "StatusReasonMapFind");
    SRMFindIn = SRMFindInIn;
  }

  public void translateToMap() {
    if (SRMFindIn != null) {
      Integer index =  SRMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatusReasonMap", SRMObjectHelper.toMap(SRMFindIn, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }


/**
 *
 * Sets the StatusReasonMap
 * @param SRMFindInIn Value of the SRMFindIn
 *
 */

  public void setStatusReasonMap(SRMObjectFilter SRMFindInIn) {
    SRMFindIn = SRMFindInIn;
  }

  public void translateFromMap() {
    SRMFindIn = SRMObjectHelper.fromMapFilter(inputMap, "StatusReasonMap");
  }

/**
 *
 * Gets the StatusReasonMap
 * @return Value of the StatusReasonMap
 *
 */

  public SRMObjectFilter getStatusReasonMap( ) {
    return SRMFindIn;
  }

}
