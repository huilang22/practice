/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NoteTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTypeObjectData NoteTypeUpdateIn;
/**
 *
 * Constructor to create a  NoteTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectData NoteTypeUpdateInIn) {
    super(id, context, "NoteTypeUpdate");
    NoteTypeUpdateIn = NoteTypeUpdateInIn;
  }

  public void translateToMap() {
    if (NoteTypeUpdateIn != null) {
      NoteTypeUpdateIn.resetFlags(true, true);
      addInput("NoteType", NoteTypeObjectHelper.toMap(NoteTypeUpdateIn, new HashMap(), "NoteType").get("NoteType"));
    }
  }


/**
 *
 * Sets the NoteType
 * @param NoteTypeUpdateInIn Value of the NoteTypeUpdateIn
 *
 */

  public void setNoteType(NoteTypeObjectData NoteTypeUpdateInIn) {
    NoteTypeUpdateIn = NoteTypeUpdateInIn;
  }

  public void translateFromMap() {
    NoteTypeUpdateIn = NoteTypeObjectHelper.fromMap(inputMap, "NoteType");
  }

/**
 *
 * Gets the NoteType
 * @return Value of the NoteType
 *
 */

  public NoteTypeObjectData getNoteType( ) {
    return NoteTypeUpdateIn;
  }

}
