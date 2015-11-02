/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobstatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobstatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobstatusObjectFilter InvsJobstatusFindIn;
/**
 *
 * Constructor to create a  InvsJobstatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobstatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstatusObjectFilter InvsJobstatusFindInIn) {
    super(id, context, "InvsJobstatusFind");
    InvsJobstatusFindIn = InvsJobstatusFindInIn;
  }

  public void translateToMap() {
    if (InvsJobstatusFindIn != null) {
      Integer index =  InvsJobstatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobstatus", InvsJobstatusObjectHelper.toMap(InvsJobstatusFindIn, new HashMap(), "InvsJobstatus").get("InvsJobstatus"));
    }
  }


/**
 *
 * Sets the InvsJobstatus
 * @param InvsJobstatusFindInIn Value of the InvsJobstatusFindIn
 *
 */

  public void setInvsJobstatus(InvsJobstatusObjectFilter InvsJobstatusFindInIn) {
    InvsJobstatusFindIn = InvsJobstatusFindInIn;
  }

  public void translateFromMap() {
    InvsJobstatusFindIn = InvsJobstatusObjectHelper.fromMapFilter(inputMap, "InvsJobstatus");
  }

/**
 *
 * Gets the InvsJobstatus
 * @return Value of the InvsJobstatus
 *
 */

  public InvsJobstatusObjectFilter getInvsJobstatus( ) {
    return InvsJobstatusFindIn;
  }

}
