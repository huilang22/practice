/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcTransDescrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTransDescrObjectKeyData nrcGetIn;
/**
 *
 * Constructor to create a  NrcTransDescrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectKeyData nrcGetInIn) {
    super(id, context, "NrcTransDescrGet");
    nrcGetIn = nrcGetInIn;
  }

  public void translateToMap() {
    if (nrcGetIn != null) {
      nrcGetIn.resetFlags(true, true);
      addInput("NrcTransDescr", NrcTransDescrObjectKeyHelper.toMap(nrcGetIn, new HashMap(), "NrcTransDescrObjectKeyData").get("NrcTransDescrObjectKeyData"));
    }
  }


/**
 *
 * Sets the NrcTransDescr
 * @param nrcGetInIn Value of the nrcGetIn
 *
 */

  public void setNrcTransDescr(NrcTransDescrObjectKeyData nrcGetInIn) {
    nrcGetIn = nrcGetInIn;
  }

  public void translateFromMap() {
    nrcGetIn = NrcTransDescrObjectKeyHelper.fromMap(inputMap, "NrcTransDescr");
  }

/**
 *
 * Gets the NrcTransDescr
 * @return Value of the NrcTransDescr
 *
 */

  public NrcTransDescrObjectKeyData getNrcTransDescr( ) {
    return nrcGetIn;
  }

}
