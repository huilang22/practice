/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberUpdateCosesBulkUdtTemplateItem.java
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
 * Class used to create a MIHSubscriberUpdateCosesBulkUdtTemplateItem Bulk Template
 *
 */

public class MIHSubscriberUpdateCosesBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MIHUpdateSubscriberObjectData MIHSUIn;
  protected String ___msisdn;
/**
 *
 * Constructor to create a  MIHSubscriberUpdateCosesBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MIHSubscriberUpdateCosesBulkUdtTemplateItem(String id, BSDMSessionContext context, MIHUpdateSubscriberObjectData MIHSUInIn, String ___msisdnIn) {
    super(id, context, "MIHSubscriberUpdateCoses");
    MIHSUIn = MIHSUInIn;
    ___msisdn = ___msisdnIn;
  }

  public void translateToMap() {
    if (MIHSUIn != null) {
      MIHSUIn.resetFlags(true, true);
      addInput("MIHSubscriber", MIHUpdateSubscriberObjectHelper.toMap(MIHSUIn, new HashMap(), "Output").get("Output"));
    }
    if (___msisdn != null) {
      addInput("Msisdn", ___msisdn);
    }
  }


/**
 *
 * Sets the MIHSubscriber
 * @param MIHSUInIn Value of the MIHSUIn
 *
 */

  public void setMIHSubscriber(MIHUpdateSubscriberObjectData MIHSUInIn) {
    MIHSUIn = MIHSUInIn;
  }

/**
 *
 * Sets the Msisdn
 * @param ___msisdnIn Value of the ___msisdn
 *
 */

  public void setMsisdn(String ___msisdnIn) {
    ___msisdn = ___msisdnIn;
  }

  public void translateFromMap() {
    MIHSUIn = MIHUpdateSubscriberObjectHelper.fromMap(inputMap, "MIHSubscriber");
    ___msisdn = (String)inputMap.get("Msisdn");
  }

/**
 *
 * Gets the MIHSubscriber
 * @return Value of the MIHSubscriber
 *
 */

  public MIHUpdateSubscriberObjectData getMIHSubscriber( ) {
    return MIHSUIn;
  }

/**
 *
 * Gets the Msisdn
 * @return Value of the Msisdn
 *
 */

  public String getMsisdn( ) {
    return ___msisdn;
  }

}
