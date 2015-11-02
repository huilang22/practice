/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistGetBulkUdtTemplateItem.java
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
 * Class used to create a AtmPoplistGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AtmPoplistGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AtmPoplistObjectKeyData atmGetIn;
/**
 *
 * Constructor to create a  AtmPoplistGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AtmPoplistGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AtmPoplistObjectKeyData atmGetInIn) {
    super(id, context, "AtmPoplistGet");
    atmGetIn = atmGetInIn;
  }

  public void translateToMap() {
    if (atmGetIn != null) {
      atmGetIn.resetFlags(true, true);
      addInput("AtmPoplist", AtmPoplistObjectKeyHelper.toMap(atmGetIn, new HashMap(), "AtmPoplistObjectKeyData").get("AtmPoplistObjectKeyData"));
    }
  }


/**
 *
 * Sets the AtmPoplist
 * @param atmGetInIn Value of the atmGetIn
 *
 */

  public void setAtmPoplist(AtmPoplistObjectKeyData atmGetInIn) {
    atmGetIn = atmGetInIn;
  }

  public void translateFromMap() {
    atmGetIn = AtmPoplistObjectKeyHelper.fromMap(inputMap, "AtmPoplist");
  }

/**
 *
 * Gets the AtmPoplist
 * @return Value of the AtmPoplist
 *
 */

  public AtmPoplistObjectKeyData getAtmPoplist( ) {
    return atmGetIn;
  }

}
