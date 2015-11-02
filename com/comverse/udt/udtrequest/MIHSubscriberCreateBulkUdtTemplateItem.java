/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberCreateBulkUdtTemplateItem.java
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
 * Class used to create a MIHSubscriberCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MIHSubscriberCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MIHSubscriberObjectData MIHSCIn;
/**
 *
 * Constructor to create a  MIHSubscriberCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MIHSubscriberCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MIHSubscriberObjectData MIHSCInIn) {
    super(id, context, "MIHSubscriberCreate");
    MIHSCIn = MIHSCInIn;
  }

  public void translateToMap() {
    if (MIHSCIn != null) {
      MIHSCIn.resetFlags(true, true);
      addInput("MIHSubscriber", MIHSubscriberObjectHelper.toMap(MIHSCIn, new HashMap(), "Output").get("Output"));
    }
  }


/**
 *
 * Sets the MIHSubscriber
 * @param MIHSCInIn Value of the MIHSCIn
 *
 */

  public void setMIHSubscriber(MIHSubscriberObjectData MIHSCInIn) {
    MIHSCIn = MIHSCInIn;
  }

  public void translateFromMap() {
    MIHSCIn = MIHSubscriberObjectHelper.fromMap(inputMap, "MIHSubscriber");
  }

/**
 *
 * Gets the MIHSubscriber
 * @return Value of the MIHSubscriber
 *
 */

  public MIHSubscriberObjectData getMIHSubscriber( ) {
    return MIHSCIn;
  }

}
