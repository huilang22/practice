/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTemplateDeleteBulkUdtTemplateItem.java
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
 * Class used to create a NoteTemplateDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTemplateDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NoteTemplateObjectKeyData NoteTemplateDeleteIn;
/**
 *
 * Constructor to create a  NoteTemplateDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTemplateDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectKeyData NoteTemplateDeleteInIn) {
    super(id, context, "NoteTemplateDelete");
    NoteTemplateDeleteIn = NoteTemplateDeleteInIn;
  }

  public void translateToMap() {
    if (NoteTemplateDeleteIn != null) {
      NoteTemplateDeleteIn.resetFlags(true, true);
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(NoteTemplateDeleteIn, new HashMap(), "NoteTemplateObjectKeyData").get("NoteTemplateObjectKeyData"));
    }
  }


/**
 *
 * Sets the NoteTemplate
 * @param NoteTemplateDeleteInIn Value of the NoteTemplateDeleteIn
 *
 */

  public void setNoteTemplate(NoteTemplateObjectKeyData NoteTemplateDeleteInIn) {
    NoteTemplateDeleteIn = NoteTemplateDeleteInIn;
  }

  public void translateFromMap() {
    NoteTemplateDeleteIn = NoteTemplateObjectKeyHelper.fromMap(inputMap, "NoteTemplate");
  }

/**
 *
 * Gets the NoteTemplate
 * @return Value of the NoteTemplate
 *
 */

  public NoteTemplateObjectKeyData getNoteTemplate( ) {
    return NoteTemplateDeleteIn;
  }

}
