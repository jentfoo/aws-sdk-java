/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings to identify the end of the clip.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopTimecode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopTimecode implements Serializable, Cloneable, StructuredPojo {

    /**
     * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to
     * exclude (the default) or include the frame specified by the timecode.
     */
    private String lastFrameClippingBehavior;
    /**
     * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the
     * end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     */
    private String timecode;

    /**
     * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to
     * exclude (the default) or include the frame specified by the timecode.
     * 
     * @param lastFrameClippingBehavior
     *        If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the
     *        clip to exclude (the default) or include the frame specified by the timecode.
     * @see LastFrameClippingBehavior
     */

    public void setLastFrameClippingBehavior(String lastFrameClippingBehavior) {
        this.lastFrameClippingBehavior = lastFrameClippingBehavior;
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to
     * exclude (the default) or include the frame specified by the timecode.
     * 
     * @return If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the
     *         clip to exclude (the default) or include the frame specified by the timecode.
     * @see LastFrameClippingBehavior
     */

    public String getLastFrameClippingBehavior() {
        return this.lastFrameClippingBehavior;
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to
     * exclude (the default) or include the frame specified by the timecode.
     * 
     * @param lastFrameClippingBehavior
     *        If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the
     *        clip to exclude (the default) or include the frame specified by the timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastFrameClippingBehavior
     */

    public StopTimecode withLastFrameClippingBehavior(String lastFrameClippingBehavior) {
        setLastFrameClippingBehavior(lastFrameClippingBehavior);
        return this;
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to
     * exclude (the default) or include the frame specified by the timecode.
     * 
     * @param lastFrameClippingBehavior
     *        If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the
     *        clip to exclude (the default) or include the frame specified by the timecode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastFrameClippingBehavior
     */

    public StopTimecode withLastFrameClippingBehavior(LastFrameClippingBehavior lastFrameClippingBehavior) {
        this.lastFrameClippingBehavior = lastFrameClippingBehavior.toString();
        return this;
    }

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the
     * end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     * 
     * @param timecode
     *        The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues
     *        to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     */

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the
     * end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     * 
     * @return The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip
     *         continues to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     */

    public String getTimecode() {
        return this.timecode;
    }

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the
     * end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     * 
     * @param timecode
     *        The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues
     *        to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopTimecode withTimecode(String timecode) {
        setTimecode(timecode);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLastFrameClippingBehavior() != null)
            sb.append("LastFrameClippingBehavior: ").append(getLastFrameClippingBehavior()).append(",");
        if (getTimecode() != null)
            sb.append("Timecode: ").append(getTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTimecode == false)
            return false;
        StopTimecode other = (StopTimecode) obj;
        if (other.getLastFrameClippingBehavior() == null ^ this.getLastFrameClippingBehavior() == null)
            return false;
        if (other.getLastFrameClippingBehavior() != null && other.getLastFrameClippingBehavior().equals(this.getLastFrameClippingBehavior()) == false)
            return false;
        if (other.getTimecode() == null ^ this.getTimecode() == null)
            return false;
        if (other.getTimecode() != null && other.getTimecode().equals(this.getTimecode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastFrameClippingBehavior() == null) ? 0 : getLastFrameClippingBehavior().hashCode());
        hashCode = prime * hashCode + ((getTimecode() == null) ? 0 : getTimecode().hashCode());
        return hashCode;
    }

    @Override
    public StopTimecode clone() {
        try {
            return (StopTimecode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.StopTimecodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
