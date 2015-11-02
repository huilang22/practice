/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvJobFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobObjectFilter InvJobFindIn;
/**
 *
 * Constructor to create a  InvJobFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectFilter InvJobFindInIn) {
    super(id, context, "InvJobFind");
    InvJobFindIn = InvJobFindInIn;
  }

  public void translateToMap() {
    if (InvJobFindIn != null) {
      Integer index =  InvJobFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJob", InvJobObjectHelper.toMap(InvJobFindIn, new HashMap(), "InvJob").get("InvJob"));
    }
  }


/**
 *
 * Sets the InvJob
 * @param InvJobFindInIn Value of the InvJobFindIn
 *
 */

  public void setInvJob(InvJobObjectFilter InvJobFindInIn) {
    InvJobFindIn = InvJobFindInIn;
  }

  public void translateFromMap() {
    InvJobFindIn = InvJobObjectHelper.fromMapFilter(inputMap, "InvJob");
  }

/**
 *
 * Gets the InvJob
 * @return Value of the InvJob
 *
 */

  public InvJobObjectFilter getInvJob( ) {
    return InvJobFindIn;
  }

}
